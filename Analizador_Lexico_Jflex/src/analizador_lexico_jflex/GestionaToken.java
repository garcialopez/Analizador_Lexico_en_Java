package analizador_lexico_jflex;

public class GestionaToken {
    private String token;
    private String lexema;

    public GestionaToken(String token, String lexema) {
        this.token = token;
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "Token: " + token + " ---- Lexema: " + lexema ;
    }
    
    

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @return the lexema
     */
    public String getLexema() {
        return lexema;
    }
}
