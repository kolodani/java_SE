public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = true;
        int fileSended = 3;
        
        if (isBluetoothEnable) {
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");
        }
    }
}
