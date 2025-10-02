-- Database: university (SQLite compatible)
PRAGMA writable_schema = 1;
DELETE FROM sqlite_master where type in ('table', 'index', 'trigger');
PRAGMA writable_schema = 0;
VACUUM;

PRAGMA foreign_keys = OFF;

-- Table: advisor
CREATE TABLE advisor (
  s_ID TEXT NOT NULL,
  i_ID TEXT NOT NULL,
  FOREIGN KEY (s_ID) REFERENCES student(ID),
  FOREIGN KEY (i_ID) REFERENCES instructor(ID)
);

-- Table: classroom
CREATE TABLE classroom (
  building TEXT NOT NULL,
  room_number TEXT NOT NULL,
  capacity INTEGER
);

-- Table: course
CREATE TABLE course (
  course_id TEXT PRIMARY KEY,
  title TEXT,
  dept_name TEXT NOT NULL,
  credits INTEGER
);

-- Table: department
CREATE TABLE department (
  dept_name TEXT PRIMARY KEY,
  building TEXT,
  budget REAL
);

-- Table: instructor
CREATE TABLE instructor (
  ID TEXT PRIMARY KEY,
  name TEXT NOT NULL,
  dept_name TEXT NOT NULL,
  salary REAL,
  FOREIGN KEY (dept_name) REFERENCES department(dept_name)
);

-- Table: student
CREATE TABLE student (
  ID TEXT PRIMARY KEY,
  name TEXT NOT NULL,
  dept_name TEXT,
  tot_cred INTEGER,
  FOREIGN KEY (dept_name) REFERENCES department(dept_name)
);

-- Table: takes
CREATE TABLE takes (
  ID TEXT NOT NULL,
  course_id TEXT NOT NULL,
  sec_id TEXT NOT NULL,
  semester TEXT NOT NULL,
  year INTEGER NOT NULL,
  grade TEXT,
  FOREIGN KEY (ID) REFERENCES student(ID),
  FOREIGN KEY (course_id) REFERENCES course(course_id)
);

-- Table: teaches
CREATE TABLE teaches (
  ID TEXT NOT NULL,
  course_id TEXT NOT NULL,
  sec_id TEXT NOT NULL,
  semester TEXT NOT NULL,
  year INTEGER NOT NULL,
  FOREIGN KEY (ID) REFERENCES instructor(ID),
  FOREIGN KEY (course_id) REFERENCES course(course_id)
);

-- Table: time_slot
CREATE TABLE time_slot (
  time_slot_id TEXT NOT NULL,
  day TEXT NOT NULL,
  start_hr INTEGER NOT NULL,
  start_min INTEGER NOT NULL,
  end_hr INTEGER NOT NULL,
  end_min INTEGER NOT NULL
);

INSERT INTO advisor (s_ID, i_ID) VALUES
('12345', '10101'),
('44553', '22222'),
('45678', '22222'),
('00128', '45565'),
('76543', '45565'),
('23121', '76543'),
('98988', '76766'),
('76653', '98345'),
('98765', '98345');


INSERT INTO classroom (building, room_number, capacity) VALUES
('Packard', '101', 500),
('Painter', '514', 10),
('Taylor', '3128', 70),
('Watson', '100', 30),
('Watson', '120', 50);


INSERT INTO course (course_id, title, dept_name, credits) VALUES
('BIO-101', 'Intro. to Biology', 'Biology', 4),
('BIO-301', 'Genetics', 'Biology', 4),
('BIO-399', 'Computational Biology', 'Biology', 3),
('CS-101', 'Intro. to Computer Science', 'Comp. Sci.', 4),
('CS-190', 'Game Design', 'Comp. Sci.', 4),
('CS-315', 'Robotics', 'Comp. Sci.', 3),
('CS-319', 'Image Processing', 'Comp. Sci.', 3),
('CS-347', 'Database System Concepts', 'Comp. Sci.', 3),
('EE-181', 'Intro. to Digital Systems', 'Elec. Eng.', 3),
('FIN-201', 'Investment Banking', 'Finance', 3),
('HIS-351', 'World History', 'History', 3),
('MU-199', 'Music Video Production', 'Music', 3),
('PHY-101', 'Physical Principles', 'Physics', 4);


INSERT INTO department (dept_name, building, budget) VALUES
('Biology', 'Watson', 90000.00),
('Comp. Sci.', 'Taylor', 100000.00),
('Elec. Eng.', 'Taylor', 85000.00),
('Finance', 'Painter', 120000.00),
('History', 'Painter', 50000.00),
('Music', 'Packard', 80000.00),
('Physics', 'Watson', 70000.00);


INSERT INTO instructor (ID, name, dept_name, salary) VALUES
('10101', 'Srinivasan', 'Comp. Sci.', 65000.00),
('12121', 'Wu', 'Finance', 90000.00),
('15151', 'Mozart', 'Music', 40000.00),
('22222', 'Einstein', 'Physics', 95000.00),
('32343', 'El Said', 'History', 60000.00),
('33333', 'Jackson', 'Biology', 120000.00),
('33456', 'Gold', 'Physics', 87000.00),
('45565', 'Katz', 'Comp. Sci.', 75000.00),
('58583', 'Califieri', 'History', 62000.00),
('76543', 'Singh', 'Finance', 80000.00),
('76766', 'Crick', 'Biology', 72000.00),
('83821', 'Brandt', 'Comp. Sci.', 92000.00),
('98345', 'Kim', 'Elec. Eng.', 80000.00);


INSERT INTO student (ID, name, dept_name, tot_cred) VALUES
('00000', 'ShinHwan Kang', 'Comp. Sci.', 100),
('00001', 'HoeHoon Jung', 'Comp. Sci.', 100),
('00128', 'Zhang', 'Comp. Sci.', 102),
('12345', 'Shankar', 'Comp. Sci.', 32),
('19991', 'Brandt', 'History', 80),
('23121', 'Chavez', 'Finance', 110),
('44553', 'Peltier', 'Physics', 56),
('45678', 'Levy', 'Physics', 46),
('54321', 'Williams', 'Comp. Sci.', 54),
('55739', 'Sanchez', 'Music', 38),
('70557', 'Snow', 'Physics', 0),
('76543', 'Brown', 'Comp. Sci.', 58),
('76653', 'Aoi', 'Elec. Eng.', 60),
('98765', 'Bourikas', 'Elec. Eng.', 98),
('98988', 'Tanaka', 'Biology', 120);


INSERT INTO takes (ID, course_id, sec_id, semester, year, grade) VALUES
('00128', 'CS-101', '1', 'Fall', 2021, 'A'),
('12345', 'CS-101', '1', 'Fall', 2021, 'A-'),
('54321', 'CS-101', '1', 'Fall', 2021, 'B'),
('19991', 'HIS-351', '1', 'Spring', 2022, 'B+'),
('23121', 'FIN-201', '1', 'Fall', 2021, 'C'),
('44553', 'PHY-101', '1', 'Fall', 2021, 'B'),
('45678', 'PHY-101', '1', 'Fall', 2021, 'A'),
('98765', 'EE-181', '1', 'Spring', 2022, 'A'),
('98988', 'BIO-101', '1', 'Fall', 2021, 'A'),
('76543', 'CS-315', '1', 'Spring', 2022, 'B+');


INSERT INTO teaches (ID, course_id, sec_id, semester, year) VALUES
('10101', 'CS-101', '1', 'Fall', 2021),
('45565', 'CS-315', '1', 'Spring', 2022),
('76766', 'BIO-101', '1', 'Fall', 2021),
('22222', 'PHY-101', '1', 'Fall', 2021),
('98345', 'EE-181', '1', 'Spring', 2022),
('58583', 'HIS-351', '1', 'Spring', 2022),
('12121', 'FIN-201', '1', 'Fall', 2021);


INSERT INTO time_slot (time_slot_id, day, start_hr, start_min, end_hr, end_min) VALUES
('A', 'Monday', 9, 0, 10, 30),
('A', 'Wednesday', 9, 0, 10, 30),
('A', 'Friday', 9, 0, 10, 30),
('B', 'Tuesday', 10, 0, 11, 30),
('B', 'Thursday', 10, 0, 11, 30),
('C', 'Monday', 13, 0, 14, 30),
('C', 'Wednesday', 13, 0, 14, 30),
('C', 'Friday', 13, 0, 14, 30),
('D', 'Tuesday', 15, 0, 16, 30),
('D', 'Thursday', 15, 0, 16, 30);

PRAGMA foreign_keys = ON;

PRAGMA INTEGRITY_CHECK;
