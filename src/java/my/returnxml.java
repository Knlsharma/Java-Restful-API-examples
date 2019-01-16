package my;  
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Path("/xml")  
public class returnxml {  
    
    
    
 
  // This method is called if XML is requested  
  @GET  
  @Produces(MediaType.TEXT_XML)  
  public String sayXMLHello() {  
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
  }  
  
 
} 