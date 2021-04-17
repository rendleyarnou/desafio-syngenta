package main;

//passos

		// Ler imagem - OK
			//BufferedImage + ImageIO
		// Descobrir dimensões - OK
			// imagem.getWidth();
			// imagem.getHeight();
		// Percorrer imagem - OK
			// Laços altura X largura
		// Encontrar tons de verde
			// função que gera tons de verde e converte para inteiro
		// Comparar os inteiros para saber se é verde
			// incrementa a quantidade de verdes
		// exibir o resultado

import java.awt.Color;
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
		int red = 0;
		int green = 0;
		int blue = 0;
		int rgb = 0;
		
		for(int y = 0; y < height; y++){
			for(int x = 0; x < width; x++){
				pixelValue = imagem.getRGB(x, y);  // pega o valor do pixel altura X largura
				
				
				red = (pixelValue >> 16) & 0xFF; // pega o valor do vermelho & converte de inteiro para hexa
				green = (pixelValue >> 8) & 0xFF; // pega o valor do verde & converte de inteiro para hexa
				blue = pixelValue & 0xFF; // pega o valor do azul & converte de inteiro para hexa
				rgb = new Color(red, green, blue).getRGB(); // converte para um RGB inteiro

				System.out.println("#" + red + green + blue);
				
				if ((0<red && red<150) && (0<green) && (red<green) && (blue == 0) ) { // Confere se é verde
					qtdGreen += 1;
				}
				
			}
		}
		System.out.println("qtdGreen: " + qtdGreen);
		System.out.println("toString: " + imagem);
	}
	
}
