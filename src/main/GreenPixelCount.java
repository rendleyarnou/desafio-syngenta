package main;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GreenPixelCount {

	public static void main(String[] args) {

		BufferedImage imagem = null;

		try {
			imagem = ImageIO.read(new File("Syngenta.bmp"));
		} catch (Exception e) {
			System.out.println(e);
		}

		int height = imagem.getHeight();
		int width = imagem.getWidth();

		int qtdGreen = 0;
		int pixelValue = 0;
		int red, redOutput = 0;
		int green, greenOutput = 0;
		int blue, blueOutput = 0;

		// Conta a quantidade de pixels verdes que existem na imagem
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixelValue = imagem.getRGB(x, y); // pega o valor do pixel altura X largura
				red = (pixelValue >> 16) & 0xFF; // pega o valor do vermelho & converte de inteiro para hexa
				green = (pixelValue >> 8) & 0xFF; // pega o valor do verde & converte de inteiro para hexa
				blue = pixelValue & 0xFF; // pega o valor do azul & converte de inteiro para hexa

				if ((0 < red && red < 150) && (0 < green) && (red < green) && (blue == 0)) { // Confere se é verde
					qtdGreen += 1;
					redOutput = (pixelValue >> 16) & 0xFF;
					greenOutput = (pixelValue >> 8) & 0xFF;
					blueOutput = pixelValue & 0xFF;
				}
			}
		}

		System.out.println("Quantidade de pixels verdes: " + qtdGreen);
		System.out.println();
		System.out.println("HEX da cor:");
		System.out.println("| " + "R" + "  |  " + "G" + "  |  "  + "B" + " |" );
		System.out.println("| " + redOutput + " | " + greenOutput + " |  " + blueOutput + " |");
//		System.out.println("Valor RGB: " + "R:" + redOutput + " " + "G:" + greenOutput + " " + "B:" + blueOutput);

		
//		String matriz[][] = new String[420][300];
//
////		aloca os valores na matriz de string
//		for (int y = 0; y < height; y++) {
//			for (int x = 0; x < width; x++) {
//				pixelValue = imagem.getRGB(x, y);
//				red = (pixelValue >> 16) & 0xFF;
//				green = (pixelValue >> 8) & 0xFF;
//				blue = pixelValue & 0xFF;
//
//				if ((0 < red && red < 150) && (0 < green) && (red < green) && (blue == 0)) {
//					matriz[x][y] = "°";
//				} else {
//					matriz[x][y] = " ";
//				}
//			}
//		}
//
////		 imprime a matriz com os valores em hex ou símbolos '#' e '0'
//		for (int y = 0; y < height; y++) {
//			for (int x = 0; x < width; x++) {
////				pixelValue = imagem.getRGB(x, y);
////				red = (pixelValue >> 16) & 0xFF;
////				green = (pixelValue >> 8) & 0xFF;
////				blue = pixelValue & 0xFF;
////				System.out.print(" #" + red + green + blue + "");
//
//				System.out.print(matriz[x][y]);
//			}
//			System.out.println();
//		}

	}

}
