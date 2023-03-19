import java.util.Map;
import java.util.HashMap;

// Class to store a phone book entry
class Practical17 {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;

    public Practical17(String fullName, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Getters and setters for the class variables
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Method to create a human-readable representation of the phone book entry
    @Override
    public String toString() {
        return "Full name: " + fullName + "\nPhone number: " + phoneNumber + "\nEmail: " + email + "\nAddress: " + address + "\n";
    }
}

// Class to store a phone book with a map of phone book entries
class PhoneBook {
    private Map<String, Practical17> entries;

    public PhoneBook() {
        // Initialize the map to store phone book entries
        entries = new HashMap<>();
    }

    // Method to insert a new phone book entry
    public void insertEntry(Practical17 entry) {
        entries.put(entry.getFullName(), entry);
    }

    // Method to update an existing phone book entry
    public void updateEntry(Practical17 entry) {
        entries.put(entry.getFullName(), entry);
    }

    // Method to delete an existing phone book entry
    public void deleteEntry(String fullName) {
        entries.remove(fullName);
    }

    // Method to print the details of a specific phone book entry
    public void printEntry(String fullName) {
        Practical17 entry = entries.get(fullName);
        if (entry != null) {
            System.out.println(entry);
        } else {
            System.out.println("No entry found for " + fullName + ".");
        }
    }

    // Method to print all phone book entries
    public void printAllEntries() {
        for (Practical17 entry : entries.values()) {
            System.out.println(entry);
        }
    }
}

// Class to create a phone book instance and perform operations on it
class User {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Insert a new phone book entry
        Practical17 entry1 = new Practical17("John Smith", "123-456-7890", "johnsmith@example.com", "123 Main");
    }
}
