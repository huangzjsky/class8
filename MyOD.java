import java.io.*;

public class MyOD {
    public static void main(String[] args) {

        File file = new File(args[1]);

        switch (args[0]){
            case "-tc" :

                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(file));
                    String tempString = null;

                    int line = 1;
                    while ((tempString = reader.readLine()) != null) {

                        System.out.println(Integer.valueOf(tempString));
                        line++;
                    }
                    reader.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e1) {
                        }
                    }
                }
                break;
            case "-tx" :
                InputStream binreader = null;
                String out;
                try {
                    binreader = new FileInputStream (file);
                    int outread;
                    outread = binreader.read();
                    System.out.println(outread);

                    binreader.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                } finally {
                    if (binreader != null) {
                        try {
                            binreader.close();
                        } catch (IOException e1) {
                        }
                    }
                }
                break;
        }
    }
}