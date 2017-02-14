import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import static java.lang.System.out;

public class MyPreferences {

	static void println(Object w) {
		out.println(w);
	}

	static Preferences getPreferences() {
		return Preferences.userNodeForPackage(MyPreferences.class);
	}

	public static void main(String[] args) {

		println(getPreferences().absolutePath());
		try {
			for (String key : getPreferences().keys()) {
				out.print(key + ":");
				println(getPreferences().get(key, "NULL"));
			}
		} catch (BackingStoreException e) {
		}
	}

}
