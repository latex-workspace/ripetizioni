PRAGMA writable_schema = 1;
DELETE FROM sqlite_master where type in ('table', 'index', 'trigger');
PRAGMA writable_schema = 0;
VACUUM;

CREATE TABLE sailor (
id INTEGER PRIMARY KEY,
name TEXT NOT NULL,
surname TEXT NOT NULL
);

CREATE TABLE boat (
id INTEGER PRIMARY KEY,
color TEXT NOT NULL
);

CREATE TABLE books (
sailor_id INTEGER,
boat_id INTEGER,
date TEXT,
PRIMARY KEY (sailor_id, boat_id),
FOREIGN KEY (sailor_id) REFERENCES sailor(id) ON DELETE CASCADE,
FOREIGN KEY (boat_id) REFERENCES boat(id) ON DELETE CASCADE
);

-- Insert random sailors
INSERT INTO sailor (name, surname) VALUES 
('John', 'Doe'),
('Jane', 'Smith'),
('Bob', 'Johnson'),
('Alice', 'Williams'),
('Charlie', 'Brown'),
('David', 'Jones'),
('Emma', 'Miller'),
('Ethan', 'Davis'),
('Sophia', 'Martinez'),
('Lucas', 'Garcia');

-- Insert random boats
INSERT INTO boat (color) VALUES 
('Red'),
('Blue'),
('Green'),
('Red'),
('Red'),
('Blue'),
('Green'),
('Green'),
('Gray'),
('Gray');

-- Insert random books (sailor_id and boat_id as foreign keys)
INSERT INTO books (sailor_id, boat_id, date) VALUES 
(1, 1, '2025-03-24'),
(1, 2, '2025-03-20'),
(2, 3, '2025-03-18'),
(2, 4, '2025-03-22'),
(3, 5, '2025-03-21'),
(3, 6, '2025-03-19'),
(4, 7, '2025-03-17'),
(4, 8, '2025-03-23'),
(5, 9, '2025-03-15'),
(5, 10, '2025-03-16');

PRAGMA INTEGRITY_CHECK;
