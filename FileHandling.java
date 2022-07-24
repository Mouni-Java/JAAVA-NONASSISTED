package Filehandling;
   import java.io.File;
	import java.io.FileWriter;
	import java.io.FileReader;
	import java.io.IOException;
public class FileHandling {
		public static void createFileUsingFileClass() throws IOException
		{
			File file= new File("C:\\filehandling\\textjava.text");
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File  is already exist");
			}
			FileWriter  writer= new  FileWriter(file,false);
			
			writer.write("Welcome to File Handling");
			writer.close();
		}
		public static void readFileReaderClass() throws IOException
		{ 
			FileReader reader= new FileReader("C:\\filehandling\\textjava.text");
			
			int data;
			
			while((data=reader.read())!=-1){
				
				System.out.print((char)data);
			}
		}
		public static void AppendToFile() throws IOException
		{
			 
	         
	         FileWriter fileWritter = new FileWriter("C:\\filehandling\\textjava.text",true);
	         fileWritter.write("\nEveryone");
	         fileWritter.close();
	         System.out.println("\nAppend done");
		}
		public static void main(String[] args) {
			try {
				 createFileUsingFileClass();
				 readFileReaderClass();
				 AppendToFile();
				 } catch (IOException e) {
				 e.printStackTrace();
			}
		}
	}


