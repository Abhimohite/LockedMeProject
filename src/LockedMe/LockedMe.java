package LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class LockedMe {


		
	
		static File folder = new File("F:\\project2");
		// Just one scanner is used along the application
		static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		public static void main(String[] args) {
		//Boolean to identify if the loop continues or not
			System.out.println("****Welcome to LockedMe.com****");
			System.out.println("1) Display all files");
			System.out.println("2) Add a new file");
			System.out.println("3) Delete a file");
			System.out.println("4) Search a file");
			System.out.println("5) Exit");
		boolean bExit = false;
		// Option Selected
		Integer iResponse = 0;
		// Exits when user selects option 5
		while (!bExit) {
		// The menu is painted on screen
		menu();
		try {
		// User input is read
		iResponse = Integer.parseInt(scanner.nextLine());
		System.out.println(" > Option: " + iResponse);
		// Choose the option selected by user
		switch (iResponse) {
		case 1: {
		//All files are painted on screen
		Random random = new Random();
		int rn = random.nextInt(6) + 1;

		switch (rn) {
		case 1:
		// Get all files using a for loop
		getAllFiles_forLoop();
		break;
		case 2:
		// Get all files using a while loop
		getAllFiles_while();
		break;
		case 3:
		// Get all files using a for each loop
		getAllFiles_forEachLoop();
		break;
		case 4:
		// Get all files using an iterator of a linkedlist
		getAllFiles_Iterator();
		break;
		case 5:
		// Get all files using an iterator of a linkedlist
		getAllFiles_LambdaExpression();
		break;
		case 6:
		// Get all files using the Enumeration Interface
		getAllFiles_EnumerationInterface();
		break;
		} 
		break;
		} 
		case 2: {
		//User defines name and contents of a new file
		createFile(scanner);
		
		break;
		} 
		case 3: { 
		//User chooses a file to delete
		deleteFile(scanner);
		
		break;
		} 
		case 4: {
		//Determine if a file exists
		searchFiles(scanner);
		
		break;
		} case 5: {
		//Exit the program
		bExit = true;

		break;
		} default: {
		//On error the program ends
		bExit = true;
		}
		}
		}catch(NumberFormatException e){
			System.out.println("Please print only numbers");
		}
		}
		}
		private static void searchFiles(Scanner scanner2) {
			// TODO Auto-generated method stub
			
		}
		private static void getAllFiles_Iterator() {
			// TODO Auto-generated method stub
			
		}
		private static void PrintMessage(String string) {
			// TODO Auto-generated method stub
			
		}
		private static void menu() {
			// TODO Auto-generated method stub
			
		}
		/*** Get All files using a for loop*/
		
		public static void getAllFiles_forLoop() {
		PrintMessage("---> getAllFiles_forLoop");
		//Name of files are stored in an array
		File[] listOfFiles = folder.listFiles();
		//We use an Arraylist to contain the list of files
		List<File> alListOfFiles = new ArrayList<File>();
		Collections.addAll(alListOfFiles, listOfFiles);
		//Read the Arraylist using a for loop with the name of the files1
		try {
		for (int i = 0; i < alListOfFiles.size(); i++) {
		System.out.println(alListOfFiles.get(i));
		}
		//On error an exception is raised
		} catch (Exception e) {
			System.out.println("Error: file not found");
		}
		}
		//*** Get all files using a while loop and a linkedlist*/
		public static void getAllFiles_while() {
		PrintMessage("---> getAllFiles_while");
		File[] listOfFiles = folder.listFiles();
		LinkedList<File> llListOfFiles = new LinkedList<File>();
		//Get the list into the linkedlist
		Collections.addAll(llListOfFiles, listOfFiles);
		int counter = 0;
		//Traverse the linkedlist
		while (llListOfFiles.size() > counter) {
		System.out.println(llListOfFiles.get(counter));
		counter++;
		}
		}
		//*** Get all the files using a for each loop*/
		
		public static void getAllFiles_forEachLoop() {
		System.out.println("---> getAllFiles_forEachLoop");
		File[] listOfFiles = folder.listFiles();
		//Use a simplified loop
		for (File myFile : listOfFiles) {
		System.out.println(myFile.getName());
		}
		}
		//*** Get all the files using a lambda expression*/
		public static void getAllFiles_LambdaExpression() {
		PrintMessage("---> getAllFiles_LambdaExpression");
		File[] listOfFiles = folder.listFiles();
		List<File> alListOfFiles = new ArrayList<>();
		Collections.addAll(alListOfFiles, listOfFiles);
		//The lambda expression get the file and prints it
		alListOfFiles.forEach((file) -> {
		System.out.println(file.getName());
		});
		}
		//*** Get all files using the enumeration interface*/
		public static void getAllFiles_EnumerationInterface() {
		PrintMessage("---> getAllFiles_EnumerationInterface");
		File[] listOfFiles = folder.listFiles();
		List<File> alListOfFiles = new ArrayList<>();
		Collections.addAll(alListOfFiles, listOfFiles);
		//Use the interface to iterate through the list elements
		Enumeration<File> e = Collections.enumeration(alListOfFiles);
		while (e.hasMoreElements()) {
		System.out.println(e.nextElement().getName());
		}
		}
		//*** Return all files from directory

		public static void getAllFiles_Iterator1() {
		PrintMessage("---> getAllFiles_Iterator");
		//Name of files are stored in an array
		File[] listOfFiles = folder.listFiles();
		//We use an Arraylist to contain the list of files
		List<File> alListOfFiles = new ArrayList<File>();
		Collections.addAll(alListOfFiles, listOfFiles);
		LinkedList<File> llListOfFiles = new LinkedList<>(alListOfFiles);
		//Read the Arraylist using an iterator with the name of the files
		try {
		Iterator<File> alListOfFilesIterator = llListOfFiles.iterator();
		while (alListOfFilesIterator.hasNext()) {
		System.out.println(alListOfFilesIterator.next());
		}
		//On error an exception is raised
		} catch (Exception e) {
		System.out.println("Error: file not found");
		}
		}
		//*** A file is deleted	** scannerdelete*/
		public static void deleteFile(Scanner scannerdelete) {
		try {
		//Read the name of the file to delete
		System.out.println("Write the name of the file you want to delete:");
		File fileToDelete = new File(folder + "//" +
		scannerdelete.nextLine());
		//On success
		if (fileToDelete.delete()) {
		System.out.println("File deleted successfully.");
		} else {
		//On error
		System.out.println("There was an error deleting the file");
		}
		//On error an exception is raised
		} catch (Exception e) {
		System.out.println("There was an error deleting the file");
		}
		}
		

		public static void searchFiles1(Scanner scannersearch) {
		try {
		//Name of the file to find
		System.out.println("Write the name of the file you want to find:");
		File fileTofind = new File(folder + "//" +
		scannersearch.nextLine());
		// If the file exists
		if (fileTofind.exists()) {
		System.out.println("File exists");
		} else {
		//If not a message is sent
		System.out.println("File does not exist");
		}
		//On error an exception is raised
		} catch (Exception e) {
		System.out.println("There was an error searching the file.");
		}
		}
		//*** User creates a new file** @param scannerCreate*/
		public static void createFile(Scanner scannerCreate) {
		//Writer object to use
		FileWriter writer = null;
		try {
		//Read the name of the file to create
		System.out.println("What is the name of your new file?");
		File newFile = new File(folder + "//" + scannerCreate.nextLine());
		writer = new FileWriter(newFile);
		//Read the contents of the file to create
		System.out.println("And the contents of your file are...");
		writer.write(scannerCreate.nextLine());
		writer.close();
		System.out.println("File created successfully");
		//On error an exception is raised
		} catch (Exception ex) {
		ex.printStackTrace();
		}
		}
}
		
		//*** The menu is painted on screen

