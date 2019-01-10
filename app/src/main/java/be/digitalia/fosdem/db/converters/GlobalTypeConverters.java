package be.digitalia.fosdem.db.converters;

import androidx.room.TypeConverter;
import be.digitalia.fosdem.model.Event;
import be.digitalia.fosdem.model.Track;

public class GlobalTypeConverters {
	@TypeConverter
	public static Track.Type toTrackType(String value) {
		return Track.Type.valueOf(value);
	}

	@TypeConverter
	public static String fromTrackType(Track.Type value) {
		return value.name();
	}

	@TypeConverter
	public static long fromEvent(Event event) {
		return event.getId();
	}
}