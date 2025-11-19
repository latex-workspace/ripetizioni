PRAGMA writable_schema = 1;
DELETE FROM sqlite_master where type in ('table', 'index', 'trigger');
PRAGMA writable_schema = 0;
VACUUM;

PRAGMA foreign_keys = OFF;
CREATE TABLE studenti (
    id INTEGER PRIMARY KEY,
    grade INTEGER
);

INSERT INTO studenti (id, grade) VALUES 
(1, 85),
(2, 90),
(3, 78),
(4, 92),
(5, 88),
(6, 76),
(7, 94),
(8, 80),
(9, 82),
(10, 89);

PRAGMA foreign_keys = ON;
PRAGMA INTEGRITY_CHECK;
