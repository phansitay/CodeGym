package thi_lai_module_2.file;

import thi_lai_module_2.model.SanPham;
import thi_lai_module_2.model.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public List<String> read(String path){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                if (line.trim().isEmpty()){
                    list.add(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public void writer(String path, List<SanPham> sanPhams, boolean isAppen){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,isAppen));){

            for (SanPham s : sanPhams){
                bufferedWriter.write(s.toData());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
