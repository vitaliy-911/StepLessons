package ClassWork.Enum.permision;

import java.util.EnumSet;

public enum Role {
    GUEST(EnumSet.of(Permision.READ)),
    USER(EnumSet.of(Permision.READ, Permision.WRITE)),
    ADMIN(EnumSet.allOf(Permision.class));
    private final EnumSet<Permision> permisions;

    Role(EnumSet<Permision> permisions) {
        this.permisions = permisions;
    }

    public EnumSet<Permision> getPermisions() {
        return permisions;
    }

    public boolean hasPermission(Permision permision) {
        return permisions.contains(permision);
    }


}
