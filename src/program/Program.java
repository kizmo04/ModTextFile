package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) throws IOException {

		File file = new File("list.md");
		FileWriter fw = new FileWriter(file);
		FileReader fr;
		String getLine;
		BufferedReader br;
		
		StringBuffer sb = new StringBuffer();
		
		String[] str = new String[20];
		
		String fname = "170130_SQL_05.md";
		
		   try { 
			      fr = new FileReader("/Users/kizmo04/Dropbox/homework/SQL/"+fname); 
			      br = new BufferedReader(fr);   
			      //String tmpStr = ""; 
			      while((getLine = br.readLine()) != null){ 
			         if(getLine.startsWith("## ")){
			        	 String temp = getLine.substring(3);
			        	 String temp2 = temp.replace(' ', '-');
			        	 String temp3 = temp2.toLowerCase().replace("()-", "-");
			        	 
			        	 
			            fw.write("\n["+temp+"](https://github.com/kizmo04/homework/blob/master/SQL/"+fname+"#"+temp3+")\n"); 
			            
			            } else if(getLine.startsWith("### ") || getLine.startsWith("# ")){ 
			            	//br.readLine();
					                    
			         }else {
			        	 //br.readLine();
			         }
			      } 
			      } catch (FileNotFoundException e) { 
			      e.printStackTrace(); 
			      } catch (IOException e) { 
			      e.printStackTrace(); 
			   } 
			   System.out.println(sb.toString()); 
		
		fw.close();
		System.out.println("완료!");

	}
}
