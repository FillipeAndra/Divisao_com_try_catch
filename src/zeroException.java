public class zeroException extends RuntimeException {
    private String mensagem;

    public zeroException(String mensagem){
        this.mensagem = mensagem;
    }


    @Override
    public String getMessage(){
        return this.mensagem;
    }

}
