package firstProj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("/home/zadmin/eclipse-workspace/firstProj/src/firstProj/mydata.txt");
			BufferedReader br=new BufferedReader(fr);
			String data=br.readLine();
			data=br.readLine();
			while(data!=null) {
				System.out.println(data);
				data=br.readLine();
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
