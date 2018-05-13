package com.example.geotracker.data.dtos;

public class RestrictedJourney {
    public static final long GENERATE_NEW_IDENTIFIER = 0L;

    private final long identifier;
    private final boolean complete;
    private final String startedAtUTCDateTimeIso;
    private final String completedAtUTCDateTimeIso;
    private final String title;

    public RestrictedJourney(long identifier, boolean complete, String startedAtUTCDateTimeIso, String completedAtUTCDateTimeIso, String title) {
        this.identifier = identifier;
        this.complete = complete;
        this.startedAtUTCDateTimeIso = startedAtUTCDateTimeIso;
        this.completedAtUTCDateTimeIso = completedAtUTCDateTimeIso;
        this.title = title;
    }

    public long getIdentifier() {
        return identifier;
    }

    public boolean isComplete() {
        return complete;
    }

    public String getStartedAtUTCDateTimeIso() {
        return startedAtUTCDateTimeIso;
    }

    public String getCompletedAtUTCDateTimeIso() {
        return completedAtUTCDateTimeIso;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RestrictedJourney that = (RestrictedJourney) o;

        if (getIdentifier() != that.getIdentifier()) return false;
        if (isComplete() != that.isComplete()) return false;
        if (getStartedAtUTCDateTimeIso() != null ? !getStartedAtUTCDateTimeIso().equals(that.getStartedAtUTCDateTimeIso()) : that.getStartedAtUTCDateTimeIso() != null)
            return false;
        if (getCompletedAtUTCDateTimeIso() != null ? !getCompletedAtUTCDateTimeIso().equals(that.getCompletedAtUTCDateTimeIso()) : that.getCompletedAtUTCDateTimeIso() != null)
            return false;
        return getTitle() != null ? getTitle().equals(that.getTitle()) : that.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getIdentifier() ^ (getIdentifier() >>> 32));
        result = 31 * result + (isComplete() ? 1 : 0);
        result = 31 * result + (getStartedAtUTCDateTimeIso() != null ? getStartedAtUTCDateTimeIso().hashCode() : 0);
        result = 31 * result + (getCompletedAtUTCDateTimeIso() != null ? getCompletedAtUTCDateTimeIso().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        return result;
    }
}
