package activitytracker;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String desc;
    private ActivityType type;
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, ActivityType type, List<TrackPoint> trackPoints) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
        this.trackPoints = trackPoints;
    }



    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }

    public long getId() {
        return id;
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return id == activity.id && Objects.equals(startTime, activity.startTime) && Objects.equals(desc, activity.desc) && type == activity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, desc, type);
    }
}
