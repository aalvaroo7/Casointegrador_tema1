import java.util.List;

public class ResourceCalculator {
    private List<Resource> resources;

    public ResourceCalculator(List<Resource> resources) {
        this.resources = resources;
    }

    public double calculateTotalConsumption(int days) {
        double total = 0;
        for (Resource resource : resources) {
            total += resource.getDailyConsumption() * days;
        }
        return total;
    }

    public double calculateAverageConsumption(int days) {
        return calculateTotalConsumption(days) / resources.size();
    }

    public double calculateMaxConsumption(int days) {
        double max = Double.MIN_VALUE;
        for (Resource resource : resources) {
            double consumption = resource.getDailyConsumption() * days;
            if (consumption > max) {
                max = consumption;
            }
        }
        return max;
    }

    public double calculateMinConsumption(int days) {
        double min = Double.MAX_VALUE;
        for (Resource resource : resources) {
            double consumption = resource.getDailyConsumption() * days;
            if (consumption < min) {
                min = consumption;
            }
        }
        return min;
    }
}
