package InheritanceAssignment;

public class TestUniversity {

	public static void main(String[] args) {

		RGIT r = new RGIT();
		r.teaching();
		RGIT.ranking();
		r.research();
		r.assessment();
		r.labFacilities();
		r.study();
		r.placements();
		r.syllabus();
		r.departments();
		System.out.println(r.marks);
		System.out.println(RGIT.course);

		AITS a = new AITS();
		a.teaching();
		AITS.ranking();
		a.research();
		a.assessment();
		a.seminars();
		a.workshops();
		a.placements();
		a.departments();
		a.syllabus();

		MITS m = new MITS();
		m.teaching();
		MITS.ranking();
		m.research();
		m.assessment();
		m.internals();
		m.labPracticals();
		m.placements();
		m.syllabus();
		m.departments();

		University u = new University();
		u.teaching();
		University.ranking();
		u.research();
		u.assessment();
		u.placements();
		u.syllabus();
		u.departments();
		System.out.println(u.marks);
		System.out.println(University.course);

		University un = new RGIT();
		un.teaching();
		University.ranking();
		un.research();
		un.assessment();
		un.placements();
		un.syllabus();
		un.departments();

		University ur = new AITS();
		ur.teaching();
		University.ranking();
		ur.research();
		ur.assessment();
		ur.placements();
		ur.syllabus();
		ur.departments();

		University ut = new MITS();
		ut.teaching();
		University.ranking();
		ut.research();
		ut.assessment();
		ut.placements();
		ut.syllabus();
		ut.departments();

		CentralUniversity cu = new CentralUniversity();
		cu.placements();
		cu.syllabus();
		cu.departments();

	}

}
