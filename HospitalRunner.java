package hospital;

public class HospitalRunner {
	static Hospital hospital = new Hospital();
	public static void main(String[] args) {
		String currentCase = "tumor";
		// When you find the case, then you can find doctor title
		// If you find doctor title, then you can find the doctor information
		
		String title = doctorTitle(currentCase);
		
		System.out.println(title);
		
		
		System.out.println(findDoctor(title));
		
		System.out.println(findPatient(currentCase));
		
	}
	public static String doctorTitle(String actualCase) {
		String title = "";
		switch (actualCase) {
		case "headache":
			title = "Generalist";
			break;
		case "allergy":
			title = "Pediatrist";
			break;
		case "vision":
			title = "Ophthalmologist";
			break;
		case "muscle":
			title = "Neurologist";
			break;
		case "heart diseases":
			title = "Internist";
			break;
		case "tumor":
			title = "Dermatologist";
			break;
		case "stomacache":
			title = "Internist";
			break;
		default:
			System.out.println("No matching Title!");
			break;
		}
		return title;
	}
	public static Doctor findDoctor(String title) {
		Doctor doctor = new Doctor();
		
		for (int i = 0; i < hospital.titles.length; i++) {
			
			if (title.equalsIgnoreCase(hospital.titles[i])) {
				doctor.setName(hospital.doctorNames[i]);
				doctor.setLastname(hospital.doctorLastNames[i]);
				doctor.setTitle(hospital.titles[i]);
			}
		}
		return doctor;
	}
	public static Case findCase(String actualCase) {
		Case case1 = new Case();
		switch (actualCase) {
		case "headache":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "allergy":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
		case "vision":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "muscle":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		case "heart diseases":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
		case "tumor":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case "stomacache":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		default:
			System.out.println("No matching Case!");
			break;
		}
		return case1;
	}
	
	
	
	//
	public static Patient findPatient(String actualCase) {
		
		Patient patient = new Patient();
		
		
		for(int i=0;i < hospital.cases.length;i++ )
		
		if(actualCase.equalsIgnoreCase(hospital.cases[i])) {
			patient.setName(hospital.patientNames[i]);
			patient.setLastname(hospital.patientLastNames[i]);
			patient.setPatientId(hospital.patientIds[i]);
			patient.setPatientCase(findCase(actualCase));
			
		}
		
		return patient;
		
	}

		
}


