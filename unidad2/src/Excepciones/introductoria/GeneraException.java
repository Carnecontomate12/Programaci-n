package Excepciones.introductoria;

import java.io.IOException;
import java.util.InputMismatchException;

public class GeneraException {
		public void generaIOException() throws IOException{
			try {
				throw new IOException();
			}
			catch(IOException e) {
				System.out.println("En el catch de IO");

		}
	}
}
