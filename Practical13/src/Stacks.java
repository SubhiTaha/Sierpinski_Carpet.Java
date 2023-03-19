import java.util.Stack;
import java.util.StringTokenizer;

public class Stacks {
    public class SimpleParser {

        public static void main(String[] args) {


            String input = "4 5 + 1 2 * - 5 / ";

            // Separate tokens
            StringTokenizer tokenizer = new StringTokenizer(input, " ");
            String token = null;

            // Process input
            while (tokenizer.hasMoreElements()) {
                token = tokenizer.nextToken();

                try {
                    // Check if token is numeric
                    Double tmpDouble = Double.parseDouble(token);
                    System.out.println("Double: " + tmpDouble);
                } catch (NumberFormatException nfe) {
                    // Process token at text
                    System.out.println("String: " + token);
                }
            }
            Stack<String> stack = new Stack<String>();
            while (tokenizer.hasMoreElements()) {
                // Extract and print next line
                //token = tokenizer.nextToken();
                System.out.println("token: " + token);

                // find first '<' character (if any)
                int startIndex = token.indexOf('+');
                while (startIndex != -1) {
                    // find next '>' character
                    int endIndex = token.indexOf('*', startIndex + 1);

                    // check if '>' character is missing (syntax error)
                    if (endIndex == -1) {
                        System.err.println("Syntax error, invalid in line: *" + token);
                        return;
                    }

                    // strip away < >
                    String tag = token.substring(startIndex + 1, endIndex);

                    // This is an opening tag
                    if (!tag.startsWith("/")) {
                        // Opening tags are pushed into the stack
                        stack.push(tag);
                    }
                    // This is a closing tag
                    else {
                        // Stack contains tags
                        if (!stack.isEmpty()) {
                            String openingTag = stack.pop();
                            if (!tag.substring(1).equals(openingTag)) {
                                System.err.println("Syntax error, mismatch in opening/closing " +
                                        "tags for tags: <" + openingTag + "> and " + tag);
                                return;
                            }
                        }
                        // Stack is empty (syntax error)
                        else {
                            System.err.println("Syntax error, no tags to match for tag: <" + tag + ">");
                            return;
                        }
                    }
                    // find next '<' character (if any)
                    startIndex = token.indexOf('<', endIndex + 1);
                }
            }

            // Check if all opening tags have been matched
            if (!stack.isEmpty()) {
                System.err.println("Syntax error, unmatched tags remain." + stack);
            } else {
                System.out.println("Valid HTML text");
            }
        }

        }

    }

