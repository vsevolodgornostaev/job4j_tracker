package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JobTest {

    @Test
    public void whenJobAscByName() {
        Comparator<Job> compAscName = new JobAscByName();
        int rsl = compAscName.compare(
                new Job("Task1", 4),
                new Job("Task4", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenJobAscByPriority() {
        Comparator<Job> compAscPriority = new JobAscByPriority();
        int rsl = compAscPriority.compare(
                new Job("Task2", 4),
                new Job("Task1", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenJobDescByName() {
        Comparator<Job> compDescName = new JobDescByName();
        int rsl = compDescName.compare(
                new Job("Task1", 4),
                new Job("Task4", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenJobDescByPriority() {
        Comparator<Job> compDescPriority = new JobDescByPriority();
        int rsl = compDescPriority.compare(
                new Job("Task2", 4),
                new Job("Task1", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenJobAscByNameAscByPriority() {
        Comparator<Job> compAscNameAscPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = compAscNameAscPriority.compare(
                new Job("Task1", 4),
                new Job("Task1", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenJobAscByNameDescByPriority() {
        Comparator<Job> compAscNameDescPriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = compAscNameDescPriority.compare(
                new Job("Task1", 4),
                new Job("Task1", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenJobDescByNameAscByPriority() {
        Comparator<Job> compDescNameAscPriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = compDescNameAscPriority.compare(
                new Job("Task1", 4),
                new Job("Task2", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenJobDescByNameDescByPriority() {
        Comparator<Job> compDescNameDescPriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = compDescNameDescPriority.compare(
                new Job("Task1", 4),
                new Job("Task2", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}