package Model.Services;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

public class CriptografiaService {
	
	private static BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
	private static StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
	
	public static String CriptografarTexto( String textoOriginal, String senhaDoUsuario) {
		textEncryptor.setPasswordCharArray(senhaDoUsuario.toCharArray());
		String textoCriptografado = textEncryptor.encrypt(textoOriginal);
		return textoCriptografado;
	}
	
	public static String DescriptografarTexto(String textoCriptografado, String senhaDoUsuario) {
		textEncryptor.setPasswordCharArray(senhaDoUsuario.toCharArray());
		String textoOriginal = textEncryptor.decrypt(textoCriptografado);
		return textoOriginal;
	}
	
	public static String CriptografarSenha(String senha) {
		String senhaCriptografada = passwordEncryptor.encryptPassword(senha);
		return senhaCriptografada;
	}
	
	public static boolean ValidarSenha(String senhaInformada, String senhaCriptografada) {
		if (passwordEncryptor.checkPassword(senhaInformada, senhaCriptografada)) {
			return true;
		}
		else {
			return false;
		}
	}
}
