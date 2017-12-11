import java.awt.*;
import java.io.FileNotFoundException;
import java.net.URI;

public class Video
{
    public static void BrowseURL() throws Exception {

        // Create Desktop object
        Desktop d = Desktop.getDesktop();

        // Browse a URL, say google.com
        d.browse(new URI("https://www.youtube.com/watch?v=SudAzo5k240"));

       // System.exit(0);


    }
}

