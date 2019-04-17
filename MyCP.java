import java.io.*;

public class MyCP {
    public static void main(String[] args) {

        File file = new File(args[1]);
        File fileout = new File(args[2]);

        switch (args[0]){
            case "-tx" :

                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(file));
                    String tempString = null;

                    int line = 1;
                    while ((tempString = reader.readLine()) != null) {

                        try {
                            FileOutputStream fos = new FileOutputStream(fileout);
                            fos.write(Integer.valueOf(tempString));
                            fos.close();
                        } catch (FileNotFoundException e2){
                            e2.printStackTrace();
                        }

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
            case "-xt" :
                InputStream binreader = null;
                String out;
                try {
                    binreader = new FileInputStream (file);
                    int outread;
                    outread = binreader.read();
                    out = outread + "";
                        try {
                            FileWriter fos = new FileWriter(fileout);
                            fos.write(out);
                            fos.close();
                        } catch (FileNotFoundException e2){
                            e2.printStackTrace();
                        }

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
