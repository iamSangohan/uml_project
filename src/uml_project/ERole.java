package uml_project;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ERole {
	lecturer, tutor, examiner;
	
    public static String getRoleName(ERole role) {
        return role.name();
    }

    public static ERole getRole(String role) {
        return ERole.valueOf(role);
    }

    public static List<String> getRoles(){
        return Stream.of(ERole.values())
                     .map(ERole::name)
                     .collect(Collectors.toList());
    }
}
