DELETE FROM MOVIE_INFO;
DELETE FROM CATEGORY_INFO;
DELETE FROM SHOW_DETAILS;
DELETE FROM SCREEN_DETAILS;
DELETE FROM SHOW_SCREENING;
DELETE FROM THEATRE_INFO;
DELETE FROM SCREEN_ROW_DETAILS;
DELETE FROM USER_DETAILS;
DELETE FROM BOOKING_DETAILS;
DELETE FROM ROW_SEATS_BOOKED ;



INSERT INTO CATEGORY_INFO (CATEGORY_ID,CATEGORY_NAME,PRICE_PER_SEAT) VALUES (201,'SILVER',150.0);
INSERT INTO CATEGORY_INFO (CATEGORY_ID,CATEGORY_NAME,PRICE_PER_SEAT) VALUES (202,'GOLD',200.0);
INSERT INTO CATEGORY_INFO (CATEGORY_ID,CATEGORY_NAME,PRICE_PER_SEAT) VALUES (203,'PLATINUM',250.0);

INSERT INTO MOVIE_INFO (MOVIE_ID,MOVIE_NAME) VALUES (101,'BRAVE');
INSERT INTO MOVIE_INFO (MOVIE_ID,MOVIE_NAME) VALUES (102,'MONTANA');
INSERT INTO MOVIE_INFO (MOVIE_ID,MOVIE_NAME) VALUES (103,'LIONKING');
INSERT INTO MOVIE_INFO (MOVIE_ID,MOVIE_NAME) VALUES (104,'MADAGASCAR');
INSERT INTO MOVIE_INFO (MOVIE_ID, MOVIE_NAME) VALUES (105, 'TANGLED');


INSERT INTO SHOW_DETAILS (SHOW_ID,SHOW_NAME,SHOW_TIME) VALUES (301,'Morning Show','10:00 AM');
INSERT INTO SHOW_DETAILS (SHOW_ID,SHOW_NAME,SHOW_TIME) VALUES (302,'Afternoon Show','02:00 PM');
INSERT INTO SHOW_DETAILS (SHOW_ID,SHOW_NAME,SHOW_TIME) VALUES (303,'Evening Show','06:00 PM');
INSERT INTO SHOW_DETAILS (SHOW_ID,SHOW_NAME,SHOW_TIME) VALUES (304,'Night Show','09:00 PM');

INSERT INTO THEATRE_INFO (THEATRE_ID,THEATRE_NAME) VALUES (501,'PVR');
INSERT INTO THEATRE_INFO (THEATRE_ID,THEATRE_NAME) VALUES (502,'INOX');

INSERT INTO SCREEN_DETAILS (SCREEN_ID, TOTAL_SEAT_COUNT) VALUES (401, 10);
INSERT INTO SCREEN_DETAILS (SCREEN_ID, TOTAL_SEAT_COUNT) VALUES (402, 10);

INSERT INTO SHOW_SCREENING (SHOW_ID,MOVIE_ID,SCREEN_ID,SCREENING_FROM,SCREENING_TO,SHOW_TIMINGS,THEATRE_ID) VALUES (301,101,401,TO_DATE('2017/12/01', 'YYYY/MM/DD'), TO_DATE('2017/12/31', 'YYYY/MM/DD'),'10:00 AM',501);

INSERT INTO USER_DETAILS (USER_ID,USER_CONTACT,USER_MAILID,USER_NAME) VALUES (701,988754321,'adam@mail.com','Adam');
INSERT INTO USER_DETAILS (USER_ID,USER_CONTACT,USER_MAILID,USER_NAME) VALUES (702,980754321,'bob@mail.com','Bob');

INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (1,'A',201,402,502,'UNBLOCKED', 301,TO_DATE('2017/10/01', 'YYYY/MM/DD'));
INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (2,'A',201,401,502,'UNBLOCKED', 301,TO_DATE('2017/10/01', 'YYYY/MM/DD'));
INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (3,'A',201,401,502,'UNBLOCKED', 301,TO_DATE('2017/10/01', 'YYYY/MM/DD'));
INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (1,'A',202,401,501,'UNBLOCKED', 301,TO_DATE('2017/10/01', 'YYYY/MM/DD'));
INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (2,'A',202,401,501,'UNBLOCKED', 301,TO_DATE('2017/10/01', 'YYYY/MM/DD'));
INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (3,'A',202,402,501,'UNBLOCKED', 303,TO_DATE('2017/10/01', 'YYYY/MM/DD'));
INSERT INTO SCREEN_ROW_DETAILS (SEAT_ID,ROW_ID,CATEGORY_ID,SCREEN_ID,THEATRE_ID, SEAT_STATUS, SHOW_ID, M_DATE) VALUES (4,'A',202,402,501,'UNBLOCKED', 303,TO_DATE('2017/10/01', 'YYYY/MM/DD'));