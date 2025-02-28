import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
class ShivajiMaharaj
{
	public static void main(String[] args)
	{
		System.out.println("                JAY SHIVAJI JAY BHAVANI                      ");
		File file=new File("C:\\Users\\pravi\\Pictures\\imagesOfMaharaj.png");
		try{
			BufferedImage image=ImageIO.read(file);
			for(int i=0;i<image.getHeight();i++)
			{
				for(int j=0;j<image.getWidth();j++)
				{
					Color c1=new Color(image.getRGB(j,i));
					if(c1.getRed()==0 && c1.getGreen()==0 && c1.getBlue()==0)
						System.out.print("  ");
					else
						System.out.print("@ ");
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
	}
}