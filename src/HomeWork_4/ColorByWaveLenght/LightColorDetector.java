package HomeWork_4.ColorByWaveLenght;

public class LightColorDetector {
    public void detect(int wavelength){
        if (wavelength > 380 && wavelength <450){
            System.out.println("Violetā");
        }
        else if (wavelength >= 450 && wavelength <495){
            System.out.println("Zilā");
        }
        else if (wavelength >= 495 && wavelength <570){
            System.out.println("Zaļā");
        }
        else if (wavelength >= 570 && wavelength <590){
            System.out.println("Dzeltenā");
        }
        else if (wavelength >= 590 && wavelength <620){
            System.out.println("Oranžā");
        }
        else if (wavelength >= 620 && wavelength <750){
            System.out.println("Sarkanā");
        }else{
            System.out.println("Gaisma nav redzama");
        }
    }
}
