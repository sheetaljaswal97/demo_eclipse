package selenium;

import java.io.File;

public class Delete_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] files = new File("D:\\delete_file").listFiles();
		for(File file:files)
		{
			if(file.isFile())
			{
				file.delete();
			}
		}

	}

}
