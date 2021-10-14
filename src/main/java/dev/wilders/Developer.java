package dev.wilders;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Developer here.
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Developer here.
        LocalDate trialPeriodOver = LocalDate.now().minusMonths(6);

        if (trialPeriodOver.isAfter(employmentDate)) {
            return true;
        } else return false;
    }

}
