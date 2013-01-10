package Rush.SaveType;

public enum SaveType {

	MYSQL, NORMAL;

	public static String getSaveType(SaveType type) {

		String stype = null;

		try {

			if (type.equals("MYSQL")) {
				return stype = "MYSQL";
			} else if (type.equals("NORMAL")) {
				return stype = "NORMAL";
			} else {
				return stype = "NORMAL";
			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		return stype;
	}

}
