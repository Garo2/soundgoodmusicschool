DELETE FROM public.parent;
INSERT INTO public.parent(
	student_id, first_name, last_name, person_number, street, city, zip_code, telefon_number, email_address)
	VALUES 
	(1, 'Sarkis', 'Malko', '196410104323', 'kampevagen', 'sodertalje', 15151, 0728594234, 'sarkis@sarkis.sarkis'),
	(2, 'Sarkis', 'Malko', '196410104323', 'kampevagen', 'sodertalje', 15151, 0728594234, 'sarkis@sarkis.sarkis'),
	(2, 'Sabah', 'Malko', '196910104323', 'kampevagen', 'sodertalje', 15151, 0723592344, 'Sabah@Sabah.Sabah');