public class MyFileUtil{
  
    public static void main(String[] args){
        String fileName= "";
        
        createFile(fileName);
        
        writeText(fileName);
    }
    
    
    public static createFile(String fileName){
        File file = new File("d:\hello",fileName);
        if(!file.exists()){
            file.createNewFile();
        }
    }

  public static void writeText(String fileName){
    String text="sdfsdfsdfsdfdsfsdfjersjsdfa;sdfa
    sdfsdfsdfsdfsdfkji//ksjf";
    
      OutputStream os =new FileOutputStream(new File(fileName));
      os.write(text);
      os.close();
  }

}
