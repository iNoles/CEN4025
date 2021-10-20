import java.nio.file.Files;
import java.io.File;
import java.io.IOException;

class Animals {
   private String type;
   private String name;

    public void setType(String type) {
   	   this.type = type;
    }

    public String getType() {
   	   return type;
    }

    public void setName(String name) {
   	  this.name = name;
    }

    public String getName() {
   	    return name;
    }


   public void display() {
   	    try {
   	        Files.lines(new File("animal.txt").toPath()).forEach(System.out::println);
   	    } catch(IOException ioe) {
   	    	ioe.printStackTrace();
   	    }
   }
}
