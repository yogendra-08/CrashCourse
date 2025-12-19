import java.applet.*;
import java.awt.*;

public class PR16 extends Applet {
    String name,branch;
    
    public void init(){
        name = getParameter("fullname");
        branch = getParameter("branch");
    }

    public void paint(Graphics g){
        g.drawString("Name: "+name, 50, 50);
        g.drawString("Branch: "+branch, 50, 100);
    }
}


/* 
<html>
<body>
<applet code="PR16.class" width="300" height="300">
<param name="fullname" value="YOGI">
<param name="branch" value="CSE">
</applet>
</body>
</html>
*/
