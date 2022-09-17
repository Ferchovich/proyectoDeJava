/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;

/**
 *
 * @author octavio
 */
public class QR {
    
    public BufferedImage crearQR (String datos) throws WriterException {
        
        BitMatrix matrix;
        Writer escritor = new QRCodeWriter();
        matrix = escritor.encode(datos, BarcodeFormat.QR_CODE, 300, 300);
        BufferedImage imagen = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);

        for (int y=0; y<300;y++){
            for (int x=0;x<300;x++){
                int grayValue = (matrix.get(x, y) ? 0 : 1) & 0xff;
                imagen.setRGB(x, y, (grayValue == 0 ? 0 : 0xFFFFFF));

            }
        }
        return imagen;
        
        
    }
           
}
