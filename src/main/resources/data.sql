
insert into CONTACT ( ID, MOBILE, PHONE)
values (301, '', '01-44123030');

insert into CONTACT ( ID, MOBILE, PHONE)
values (302, '', '01-6611661');

insert into CONTACT ( ID, MOBILE, PHONE)
values (303, '', '01-4288485');

insert into CONTACT ( ID, MOBILE, PHONE)
values (304, '', '+97715427033');

insert into CONTACT ( ID, MOBILE, PHONE)
values (305, '', '01-5970132');



insert into LOCATION ( ID, COUNTRY, LOCALITY, PROVINCE)
values (201, 'Nepal', 'Maharajgunj, Kathmandu', 'Bagmati Province');

insert into LOCATION ( ID, COUNTRY, LOCALITY, PROVINCE)
values (202, 'Nepal', 'Bhaktapur', 'Bagmati Province');

insert into LOCATION ( ID, COUNTRY, LOCALITY, PROVINCE)
values (203, 'Nepal', 'Soaltee-Mode', 'Bagmati Province');

insert into LOCATION ( ID, COUNTRY, LOCALITY, PROVINCE)
values (204, 'Nepal', 'Pulchowk', 'Bagmati Province');

insert into LOCATION ( ID, COUNTRY, LOCALITY, PROVINCE)
values (205, 'Nepal', 'Old Baneshwor, Kathmandu', 'Bagmati Province');




insert into BLOOD_BANK (BLOODBANK_CONTACT_ID, BLOODBANK_LOCATION_ID ,ID, BLOODBANK_NAME)
values (301, 201, 101, 'Teching Hospital');

insert into BLOOD_BANK (BLOODBANK_CONTACT_ID, BLOODBANK_LOCATION_ID ,ID, BLOODBANK_NAME)
values (302, 202, 102, 'Bhaktapur NRCS Blood Bank');

insert into BLOOD_BANK (BLOODBANK_CONTACT_ID, BLOODBANK_LOCATION_ID ,ID, BLOODBANK_NAME)
values (303, 203, 103, 'Central NRCS Blood Bank');

insert into BLOOD_BANK (BLOODBANK_CONTACT_ID, BLOODBANK_LOCATION_ID ,ID, BLOODBANK_NAME)
values (304, 204, 104, 'Lalitpur NRCS Blood Bank');

insert into BLOOD_BANK (BLOODBANK_CONTACT_ID, BLOODBANK_LOCATION_ID ,ID, BLOODBANK_NAME)
values (305, 205, 105, 'Frontline Hospital NRCS Blood Bank');


insert into REVIEW ( ID, TITLE, DESCRIPTION, BLOODBANK_ID)
values (401, 'Good place', 'Nice treatment place', 101);

insert into REVIEW ( ID, TITLE, DESCRIPTION, BLOODBANK_ID)
values (402, 'Good place', 'Nice treatment place', 102);

insert into REVIEW ( ID, TITLE, DESCRIPTION, BLOODBANK_ID)
values (403, 'Good place', 'Nice treatment place', 103);

insert into REVIEW ( ID, TITLE, DESCRIPTION, BLOODBANK_ID)
values (404, 'Good place', 'Nice treatment place', 104);

insert into REVIEW ( ID, TITLE, DESCRIPTION, BLOODBANK_ID)
values (405, 'Good place', 'Nice treatment place', 105);

insert into REVIEW ( ID, TITLE, DESCRIPTION, BLOODBANK_ID)
values (406, 'Good place', 'Nice treatment place', 101);
