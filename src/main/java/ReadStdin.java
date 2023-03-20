import java.io.*;

class ReadStdin {

    public static void main(String[] argv) {
	if (argv.length != 1) {
	    System.out.println("Het aantal argumenten moet 1 zijn.");
	    System.exit(1);
	}

	String str;
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter output;
	

	try {
	    output = new BufferedWriter(new FileWriter(argv[0]));
	    
	    str =  input.readLine();
	    while (str != null) {
	       output.write(str);
	       output.newLine();
	      
	       str =  input.readLine();
	    }

	    output.close();
	}
	catch(IOException e) {
	    System.out.println("Onverwachte fout tijdens verwerking  van stdin: " +  e);
	}
    }

}
