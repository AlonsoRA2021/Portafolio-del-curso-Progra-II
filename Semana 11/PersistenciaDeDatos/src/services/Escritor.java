package services;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor extends Lector{
    public Escritor(String nombre){
        super(nombre);
    }
    public void escribirLetraPorLetra(String texto) throws Exception{
        try{
            FileWriter miEscritor = new FileWriter(this.getNombreArchivo());
            for(int i = 0; i <= texto.length()-1; i++){
                miEscritor.write(texto.charAt(i));
            }
            miEscritor.close();
        }catch(FileNotFoundException notFoundException){
            throw new FileNotFoundException("No se encontró el archivo");
        }catch(IOException ioException){
            throw new IOException("Error desconocido de entrada salida: " + ioException.getMessage());
        }catch(Exception ex){
            throw new Exception("Error desconocido: " + ex.getMessage());
        }finally{
            this.leerLineaPorLinea();
        }
    }
    public void escribirLinea(String texto) throws Exception{
        this.escribir(texto + "\n");
    }
    public void escribir(String texto) throws Exception{
        try{
            FileWriter miEscritor = new FileWriter(this.getNombreArchivo());
            BufferedWriter bufferedWriter = new BufferedWriter(miEscritor);
            bufferedWriter.write(texto);
            bufferedWriter.flush();
            miEscritor.close();
        }catch(FileNotFoundException notFoundException){
            throw new FileNotFoundException("No se encontró archivo");
        }catch(IOException ioException){
            throw new IOException("Error desconocido de entrada salida: " + ioException.getMessage());
        }catch(Exception ex){
            throw new Exception("Error desconocido: " + ex.getMessage());
        }finally{
            this.leerLineaPorLinea();
        }
    }
    //agregar contenido a n archivo existente
    public void agregarTexto(String texto) throws Exception{
        try{
            FileWriter miEscritor = new FileWriter(this.getNombreArchivo(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(miEscritor);
            bufferedWriter.write(System.lineSeparator() + texto);
            bufferedWriter.close();
            miEscritor.close();
        }catch(FileNotFoundException notFoundException){
            throw new FileNotFoundException("No se encontró el archivo");
        }catch(IOException ioException){
            throw new IOException("Error desconocido de entrada salida: " + ioException.getMessage());
        }catch(Exception ex){
            throw new Exception("Error desconocido: " + ex.getMessage());
        }finally{
            this.leerLineaPorLinea();
        }
    }

}
