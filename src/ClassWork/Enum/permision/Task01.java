package ClassWork.Enum.permision;

import java.util.EnumMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        EnumMap<Role, Integer> roleIntegerEnumMap = new EnumMap<>(Role.class);
        roleIntegerEnumMap.put(Role.USER, 10);
        roleIntegerEnumMap.put(Role.GUEST, 30);
        roleIntegerEnumMap.put(Role.ADMIN, 3);

        System.out.println("Колличество пользователей по ролям");
        for (Map.Entry<Role, Integer> entry : roleIntegerEnumMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        Role user = Role.USER;
        for (Permision permision : user.getPermisions()) {
            System.out.println(permision + " :" + permision.getDescriptoion());
        }
        boolean hasDel = user.hasPermission(Permision.DELETE);
        System.out.println(hasDel);

        for (Role value : Role.values()) {
            System.out.println(value);
            System.out.println(value.name());//озвращае строковое значение
        }
        int ordinal = user.ordinal();
        System.out.println(ordinal);
    }
}
