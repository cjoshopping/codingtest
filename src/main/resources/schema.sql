DROP TABLE IF EXISTS dashboard;

CREATE TABLE dashboard (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  body VARCHAR(500) NOT NULL,
  author VARCHAR(20) NOT NULL,
  update_time TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
  regist_time TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
  
);

INSERT INTO dashboard (title, body, author) VALUES
('테스트용 타이틀01', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀02', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀03', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀04', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀05', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀06', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀07', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀08', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀09', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀10', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀11', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀12', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀13', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀14', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀15', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀16', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀17', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀18', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀19', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀20', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀21', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀22', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀23', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm'),
('테스트용 타이틀24', '어쩌고저쩌고 ...어쩌고 저쩌고', 'cjenm');
;
