// public class Patient {
//     private int patientID;
//     private String name;
//     private int age;
//     private String medicalHistory;
//     private String prescriptions;

//     public Patient(int patientID, String name, int age) {
//         this.patientID = patientID;
//         this.name = name;
//         this.age = age;
//         this.medicalHistory = ""; 
//         this.prescriptions = ""; 
//     }
//     public void updateName(String name) {
//         this.name = name;
//     }
//     public void updateAge(int age) {
//         this.age = age;
//     }
//     // Method for doctors to update medical records (simulates authorized access)
//     public void updateMedicalRecord(String medicalHistory, String prescriptions, String doctorID) 
//     {
//         System.out.println("Doctor with ID: " + doctorID + " is updating medical records for Patient ID: " + this.patientID);
//         this.medicalHistory = medicalHistory;
//         this.prescriptions = prescriptions;
//     }
//     // Getter methods (for retrieving non-sensitive information)
//     public int getPatientID() {
//         return patientID;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
//     // Example getter, only used when information is needed, and should not be used to modify data.
//     public String getMedicalHistory(){
//         return medicalHistory;
//     }
//     public String getPrescriptions(){
//         return prescriptions;
//     }
//     // Method to display patient details
//     public void displayPatientDetails() {
//         System.out.println("Patient ID: " + patientID);
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Medical History: " + medicalHistory);
//         System.out.println("Prescriptions: " + prescriptions);
//     }

//     public static void main(String[] args) {
       
//         Patient patient1 = new Patient(123, "Sherri", 30);

//         // Patient updates their name and age
//         patient1.updateName("Tanzeel Rehman");
//         patient1.updateAge(31);

//         // Doctor updates medical records (simulating authorized access)
//         patient1.updateMedicalRecord("Flu and allergies.", "cough and pain relievers.", "DOC456");
        
//         patient1.displayPatientDetails();

//     }
// }

// public class C {
//     private int p;

//     public C() {
//         System.out.println("C's no-arg constructor invoked");
//         this(0); // Corrected: This should be called first.
//     }

//     public C(int p) {
//         this.p = p; // Corrected: Use 'this.p' to assign to the instance variable.
//     }

//     public void setP(int p) {
//         this.p = p; // Corrected: Use 'this.p' to assign to the instance variable.
//     }
// }