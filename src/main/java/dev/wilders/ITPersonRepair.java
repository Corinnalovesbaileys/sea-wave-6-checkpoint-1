package dev.wilders;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        // Get the name of the ITPerson, repair it and return the new name
        // EG: person.getName() -> "Super_Admin" -> return "Super Admin"
        String[] toRepairName = person.getName().split("_");
        String correctedName = toRepairName[0]+ " " + toRepairName[1];
        return correctedName;
    }
}
