package secuenciaCiclicaIncremental;

public class SecuenciaCiclicaIncremental {

	// 118 Caracteres sin espacios(desde el "boolean..."  hasta la "}"
	public boolean secuenciaCiclica(int s[]) {
		int c = 0, i = 0, l = s.length-1;
		while (i < l)
			if(s[i++] > s[i])
				c++;
		if(l > 1 && s[l] > s[0])
			c++;
		return c < 2;
	}
	
}
