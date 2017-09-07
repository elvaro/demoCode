import java.util.prefs.Preferences;

public class PrefsWarning {

    void findPrefs() {
        Preferences prefs = Preferences.userRoot();
    }

    public static void main(String[] args) {
        PrefsWarning pw = new PrefsWarning();
        pw.findPrefs();
    }

} 