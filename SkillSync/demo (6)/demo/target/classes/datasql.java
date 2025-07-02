-- Insert Users
INSERT INTO user (id, username, email, password, role) VALUES 
(1, 'gauri', 'gauri@example.com', 'hashed_password1', 'ROLE_USER'),
(2, 'rohit', 'rohit@example.com', 'hashed_password2', 'ROLE_USER');

-- Insert Skills
INSERT INTO skill (id, name) VALUES 
(1, 'Java'), 
(2, 'React'), 
(3, 'Spring Boot'), 
(4, 'SQL');

-- Insert Availability
INSERT INTO availability (id, user_id, day_of_week, time_slot) VALUES 
(1, 1, 'MONDAY', 'MORNING'),
(2, 1, 'TUESDAY', 'EVENING'),
(3, 2, 'MONDAY', 'MORNING');

-- Insert User_Skills (if many-to-many)
INSERT INTO user_skills (user_id, skill_id) VALUES 
(1, 1), (1, 3), 
(2, 2), (2, 4);

-- Insert Projects
INSERT INTO project (id, name, description) VALUES 
(1, 'AI Resume Scanner', 'Builds smart resumes and analyzes them using AI'),
(2, 'Smart Chatbot', 'A chatbot that helps students with career guidance');
