package dev.wilders;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Support here.
        if (level == 2 || level == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        if (level == 2) {
            return true;
        }
        return false;
    }
}
