
CREATE TABLE public.cat_pops
(
    activite character varying(12) COLLATE pg_catalog."default",
    libelle_activite character varying(50) COLLATE pg_catalog."default",
    sous_activite character varying(12) COLLATE pg_catalog."default",
    libelle_sous_activite character varying(50) COLLATE pg_catalog."default",
    famille character varying(12) COLLATE pg_catalog."default",
    libelle_famille character varying(50) COLLATE pg_catalog."default",
    prod_commercial character varying(12) COLLATE pg_catalog."default",
    code_produit character varying(12) COLLATE pg_catalog."default" NOT NULL,
    libelle character varying(50) COLLATE pg_catalog."default",
    nom_sys_operant character varying(25) COLLATE pg_catalog."default",
    code_sys_operant character varying(25) COLLATE pg_catalog."default",
    usage character varying(1) COLLATE pg_catalog."default",
    ribable character varying(1) COLLATE pg_catalog."default",
    libelle_court character varying(15) COLLATE pg_catalog."default",
    edition_rib character varying(1) COLLATE pg_catalog."default",
    type_produit character varying(1) COLLATE pg_catalog."default"
);


CREATE TABLE public.grc_ic_creees
(
    "MAJ-DON-TIE" character varying(1) COLLATE pg_catalog."default",
    "TYP-FON-VAL" character varying(1) COLLATE pg_catalog."default",
    bal character varying(8) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    "TYP-FON-TIE" character varying(11) COLLATE pg_catalog."default",
    "DAT-FRAICHEUR" character varying(8) COLLATE pg_catalog."default",
    "HEU-FRAICHEUR" character varying(8) COLLATE pg_catalog."default",
    "MOD-TRT-INI" character varying(2) COLLATE pg_catalog."default",
    "IDE-LGE" character varying(8) COLLATE pg_catalog."default",
    "IDE-PHY" character varying(8) COLLATE pg_catalog."default",
    "IDE-SVC" character varying(8) COLLATE pg_catalog."default",
    "TOP-FORCAGE-MAJ" character varying(1) COLLATE pg_catalog."default",
    "TOP-FORCAGE-CREATION" character varying(1) COLLATE pg_catalog."default",
    "MAJ-REF-ADR" character varying(1) COLLATE pg_catalog."default",
    "TYP-DMN" character varying(1) COLLATE pg_catalog."default",
    "IND-ICB-ICA" character varying(1) COLLATE pg_catalog."default",
    "REF-EXT" character varying(50) COLLATE pg_catalog."default",
    "CTR-NUM" character varying(13) COLLATE pg_catalog."default",
    "CLE-CTL" character varying(2) COLLATE pg_catalog."default",
    "ETT-GES" character varying(15) COLLATE pg_catalog."default",
    "TYP-PRD" character varying(2) COLLATE pg_catalog."default",
    "REF-PRD" character varying(10) COLLATE pg_catalog."default",
    "DEV-PRD" character varying(3) COLLATE pg_catalog."default",
    "NAT-JUR" character varying(1) COLLATE pg_catalog."default",
    "CYC-VIE" character varying(1) COLLATE pg_catalog."default",
    "DTE-CYC-VIE" character varying(10) COLLATE pg_catalog."default",
    "DAT-OUV-CTR" character varying(10) COLLATE pg_catalog."default",
    "ADR-TYP" character varying(2) COLLATE pg_catalog."default",
    "ADR-NUM" character varying(3) COLLATE pg_catalog."default",
    "MTF-CYC-VIE" character varying(1) COLLATE pg_catalog."default",
    "TOP-ETT-GES-AVT" character varying(1) COLLATE pg_catalog."default",
    "ETT-GES-AVT" character varying(15) COLLATE pg_catalog."default",
    "TOP-REF-PRD-AVT" character varying(1) COLLATE pg_catalog."default",
    "REF-PRD-AVT" character varying(10) COLLATE pg_catalog."default",
    typ character varying(3) COLLATE pg_catalog."default",
    sty character varying(3) COLLATE pg_catalog."default",
    "DTE-LIE" character varying(10) COLLATE pg_catalog."default",
    "DAT-ANU-LIE" character varying(10) COLLATE pg_catalog."default",
    "ROL-TIE" character varying(1) COLLATE pg_catalog."default",
    "LTC-NB-TIE" character varying(2) COLLATE pg_catalog."default",
    reference_1 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-1" character varying(13) COLLATE pg_catalog."default",
    prc_1 character varying(5) COLLATE pg_catalog."default",
    reference_2 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-2" character varying(13) COLLATE pg_catalog."default",
    prc_2 character varying(5) COLLATE pg_catalog."default",
    reference_3 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-3" character varying(13) COLLATE pg_catalog."default",
    prc_3 character varying(5) COLLATE pg_catalog."default",
    reference_4 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-4" character varying(13) COLLATE pg_catalog."default",
    prc_4 character varying(5) COLLATE pg_catalog."default",
    reference_5 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-5" character varying(13) COLLATE pg_catalog."default",
    prc_5 character varying(5) COLLATE pg_catalog."default",
    reference_6 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-6" character varying(13) COLLATE pg_catalog."default",
    prc_6 character varying(5) COLLATE pg_catalog."default",
    reference_7 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-7" character varying(13) COLLATE pg_catalog."default",
    prc_7 character varying(5) COLLATE pg_catalog."default",
    reference_8 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-8" character varying(13) COLLATE pg_catalog."default",
    prc_8 character varying(5) COLLATE pg_catalog."default",
    reference_9 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-9" character varying(13) COLLATE pg_catalog."default",
    prc_9 character varying(5) COLLATE pg_catalog."default",
    reference_10 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-10" character varying(13) COLLATE pg_catalog."default",
    prc_10 character varying(5) COLLATE pg_catalog."default",
    "REF-ADR" character varying(13) COLLATE pg_catalog."default",
    "DATE-VALO" character varying(10) COLLATE pg_catalog."default",
    "SOLDE-DEV" character varying(17) COLLATE pg_catalog."default",
    "SOLDE-DEV-FISC" character varying(17) COLLATE pg_catalog."default",
    "PLAF-DEV" character varying(17) COLLATE pg_catalog."default",
    "PLAF-DEV-FISC" character varying(17) COLLATE pg_catalog."default",
    "DEV-FISC" character varying(3) COLLATE pg_catalog."default",
    "DON-FMT" character varying(8) COLLATE pg_catalog."default",
    "DON-SPEC" character varying(300) COLLATE pg_catalog."default"
);


CREATE TABLE public.grc_ic_rejete
(
    libelle_ano character varying(100) COLLATE pg_catalog."default",
    "MAJ-DON-TIE" character varying(1) COLLATE pg_catalog."default",
    "TYP-FON-VAL" character varying(1) COLLATE pg_catalog."default",
    bal character varying(8) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    "TYP-FON-TIE" character varying(11) COLLATE pg_catalog."default",
    "DAT-FRAICHEUR" character varying(8) COLLATE pg_catalog."default",
    "HEU-FRAICHEUR" character varying(8) COLLATE pg_catalog."default",
    "MOD-TRT-INI" character varying(2) COLLATE pg_catalog."default",
    "IDE-LGE" character varying(8) COLLATE pg_catalog."default",
    "IDE-PHY" character varying(8) COLLATE pg_catalog."default",
    "IDE-SVC" character varying(8) COLLATE pg_catalog."default",
    "TOP-FORCAGE-MAJ" character varying(1) COLLATE pg_catalog."default",
    "TOP-FORCAGE-CREATION" character varying(1) COLLATE pg_catalog."default",
    "MAJ-REF-ADR" character varying(1) COLLATE pg_catalog."default",
    "TYP-DMN" character varying(1) COLLATE pg_catalog."default",
    "IND-ICB-ICA" character varying(1) COLLATE pg_catalog."default",
    "REF-EXT" character varying(50) COLLATE pg_catalog."default",
    "CTR-NUM" character varying(13) COLLATE pg_catalog."default",
    "CLE-CTL" character varying(2) COLLATE pg_catalog."default",
    "ETT-GES" character varying(15) COLLATE pg_catalog."default",
    "TYP-PRD" character varying(2) COLLATE pg_catalog."default",
    "REF-PRD" character varying(10) COLLATE pg_catalog."default",
    "DEV-PRD" character varying(3) COLLATE pg_catalog."default",
    "NAT-JUR" character varying(1) COLLATE pg_catalog."default",
    "CYC-VIE" character varying(1) COLLATE pg_catalog."default",
    "DTE-CYC-VIE" character varying(10) COLLATE pg_catalog."default",
    "DAT-OUV-CTR" character varying(10) COLLATE pg_catalog."default",
    "ADR-TYP" character varying(2) COLLATE pg_catalog."default",
    "ADR-NUM" character varying(3) COLLATE pg_catalog."default",
    "MTF-CYC-VIE" character varying(1) COLLATE pg_catalog."default",
    "TOP-ETT-GES-AVT" character varying(1) COLLATE pg_catalog."default",
    "ETT-GES-AVT" character varying(15) COLLATE pg_catalog."default",
    "TOP-REF-PRD-AVT" character varying(1) COLLATE pg_catalog."default",
    "REF-PRD-AVT" character varying(10) COLLATE pg_catalog."default",
    typ character varying(3) COLLATE pg_catalog."default",
    sty character varying(3) COLLATE pg_catalog."default",
    "DTE-LIE" character varying(10) COLLATE pg_catalog."default",
    "DAT-ANU-LIE" character varying(10) COLLATE pg_catalog."default",
    "ROL-TIE" character varying(1) COLLATE pg_catalog."default",
    "LTC-NB-TIE" character varying(2) COLLATE pg_catalog."default",
    reference_1 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-1" character varying(13) COLLATE pg_catalog."default",
    prc_1 character varying(5) COLLATE pg_catalog."default",
    reference_2 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-2" character varying(13) COLLATE pg_catalog."default",
    prc_2 character varying(5) COLLATE pg_catalog."default",
    reference_3 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-3" character varying(13) COLLATE pg_catalog."default",
    prc_3 character varying(5) COLLATE pg_catalog."default",
    reference_4 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-4" character varying(13) COLLATE pg_catalog."default",
    prc_4 character varying(5) COLLATE pg_catalog."default",
    reference_5 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-5" character varying(13) COLLATE pg_catalog."default",
    prc_5 character varying(5) COLLATE pg_catalog."default",
    reference_6 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-6" character varying(13) COLLATE pg_catalog."default",
    prc_6 character varying(5) COLLATE pg_catalog."default",
    reference_7 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-7" character varying(13) COLLATE pg_catalog."default",
    prc_7 character varying(5) COLLATE pg_catalog."default",
    reference_8 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-8" character varying(13) COLLATE pg_catalog."default",
    prc_8 character varying(5) COLLATE pg_catalog."default",
    reference_9 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-9" character varying(13) COLLATE pg_catalog."default",
    prc_9 character varying(5) COLLATE pg_catalog."default",
    reference_10 character varying(25) COLLATE pg_catalog."default",
    "TIE-NUM-EI-10" character varying(13) COLLATE pg_catalog."default",
    prc_10 character varying(5) COLLATE pg_catalog."default",
    "REF-ADR" character varying(13) COLLATE pg_catalog."default",
    "DATE-VALO" character varying(10) COLLATE pg_catalog."default",
    "SOLDE-DEV" character varying(17) COLLATE pg_catalog."default",
    "SOLDE-DEV-FISC" character varying(17) COLLATE pg_catalog."default",
    "PLAF-DEV" character varying(17) COLLATE pg_catalog."default",
    "PLAF-DEV-FISC" character varying(17) COLLATE pg_catalog."default",
    "DEV-FISC" character varying(3) COLLATE pg_catalog."default",
    "DON-FMT" character varying(8) COLLATE pg_catalog."default",
    "DON-SPEC" character varying(300) COLLATE pg_catalog."default"
);


CREATE TABLE public.grc_ic_rejete_his
(
    libelle_ano character varying(100) COLLATE pg_catalog."default",
    maj_don_tie character varying(1) COLLATE pg_catalog."default",
    typ_fon_val character varying(1) COLLATE pg_catalog."default",
    bal character varying(8) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    typ_fon_tie character varying(11) COLLATE pg_catalog."default",
    dat_fraicheur character varying(8) COLLATE pg_catalog."default",
    heu_fraicheur character varying(8) COLLATE pg_catalog."default",
    mod_trt_ini character varying(2) COLLATE pg_catalog."default",
    ide_lge character varying(8) COLLATE pg_catalog."default",
    ide_phy character varying(8) COLLATE pg_catalog."default",
    ide_svc character varying(8) COLLATE pg_catalog."default",
    top_forcage_maj character varying(1) COLLATE pg_catalog."default",
    top_forcage_creation character varying(1) COLLATE pg_catalog."default",
    maj_ref_adr character varying(1) COLLATE pg_catalog."default",
    typ_dmn character varying(1) COLLATE pg_catalog."default",
    ind_icb_ica character varying(1) COLLATE pg_catalog."default",
    ref_ext character varying(50) COLLATE pg_catalog."default",
    ctr_num character varying(13) COLLATE pg_catalog."default",
    cle_ctl character varying(2) COLLATE pg_catalog."default",
    ett_ges character varying(15) COLLATE pg_catalog."default",
    typ_prd character varying(2) COLLATE pg_catalog."default",
    ref_prd character varying(10) COLLATE pg_catalog."default",
    dev_prd character varying(3) COLLATE pg_catalog."default",
    nat_jur character varying(1) COLLATE pg_catalog."default",
    cyc_vie character varying(1) COLLATE pg_catalog."default",
    dte_cyc_vie character varying(10) COLLATE pg_catalog."default",
    dat_ouv_ctr character varying(10) COLLATE pg_catalog."default",
    adr_typ character varying(2) COLLATE pg_catalog."default",
    adr_num character varying(3) COLLATE pg_catalog."default",
    mtf_cyc_vie character varying(1) COLLATE pg_catalog."default",
    top_ett_ges_avt character varying(1) COLLATE pg_catalog."default",
    ett_ges_avt character varying(15) COLLATE pg_catalog."default",
    top_ref_prd_avt character varying(1) COLLATE pg_catalog."default",
    ref_prd_avt character varying(10) COLLATE pg_catalog."default",
    typ character varying(3) COLLATE pg_catalog."default",
    sty character varying(3) COLLATE pg_catalog."default",
    dte_lie character varying(10) COLLATE pg_catalog."default",
    dat_anu_lie character varying(10) COLLATE pg_catalog."default",
    rol_tie character varying(1) COLLATE pg_catalog."default",
    ltc_nb_tie character varying(2) COLLATE pg_catalog."default",
    reference_1 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_1 character varying(13) COLLATE pg_catalog."default",
    prc_1 character varying(5) COLLATE pg_catalog."default",
    reference_2 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_2 character varying(13) COLLATE pg_catalog."default",
    prc_2 character varying(5) COLLATE pg_catalog."default",
    reference_3 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_3 character varying(13) COLLATE pg_catalog."default",
    prc_3 character varying(5) COLLATE pg_catalog."default",
    reference_4 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_4 character varying(13) COLLATE pg_catalog."default",
    prc_4 character varying(5) COLLATE pg_catalog."default",
    reference_5 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_5 character varying(13) COLLATE pg_catalog."default",
    prc_5 character varying(5) COLLATE pg_catalog."default",
    reference_6 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_6 character varying(13) COLLATE pg_catalog."default",
    prc_6 character varying(5) COLLATE pg_catalog."default",
    reference_7 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_7 character varying(13) COLLATE pg_catalog."default",
    prc_7 character varying(5) COLLATE pg_catalog."default",
    reference_8 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_8 character varying(13) COLLATE pg_catalog."default",
    prc_8 character varying(5) COLLATE pg_catalog."default",
    reference_9 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_9 character varying(13) COLLATE pg_catalog."default",
    prc_9 character varying(5) COLLATE pg_catalog."default",
    reference_10 character varying(25) COLLATE pg_catalog."default",
    tie_num_ei_10 character varying(13) COLLATE pg_catalog."default",
    prc_10 character varying(5) COLLATE pg_catalog."default",
    ref_adr character varying(13) COLLATE pg_catalog."default",
    date_valo character varying(10) COLLATE pg_catalog."default",
    solde_dev character varying(17) COLLATE pg_catalog."default",
    solde_dev_fisc character varying(17) COLLATE pg_catalog."default",
    plaf_dev character varying(17) COLLATE pg_catalog."default",
    plaf_dev_fisc character varying(17) COLLATE pg_catalog."default",
    dev_fisc character varying(3) COLLATE pg_catalog."default",
    don_fmt character varying(8) COLLATE pg_catalog."default",
    don_spec character varying(300) COLLATE pg_catalog."default",
    type_produit character varying(3) COLLATE pg_catalog."default",
    date_rejet date
);


CREATE TABLE public.ic_delta_sop_stock
(
    ref_externe character varying(50) COLLATE pg_catalog."default",
    ref_pivot character varying(50) COLLATE pg_catalog."default",
    centre_frais character varying(5) COLLATE pg_catalog."default",
    cycl_vi character varying(1) COLLATE pg_catalog."default",
    dat_cycl_vi character varying(10) COLLATE pg_catalog."default",
    dat_ouv_ctr character varying(10) COLLATE pg_catalog."default",
    nat_maj character varying(1) COLLATE pg_catalog."default",
    cre_pac_web character varying(1) COLLATE pg_catalog."default",
    typ_prd character varying(3) COLLATE pg_catalog."default",
    num_compte character varying(50) COLLATE pg_catalog."default",
    anc_num_compte character varying(50) COLLATE pg_catalog."default",
    typ_maj_icb character varying(1) COLLATE pg_catalog."default",
    code_prd character varying(25) COLLATE pg_catalog."default",
    anc_code_prd character varying(25) COLLATE pg_catalog."default",
    sty character varying(3) COLLATE pg_catalog."default",
    date_gener character varying(10) COLLATE pg_catalog."default",
    new_ref_ext character varying(50) COLLATE pg_catalog."default"
);


CREATE TABLE public.icx_delta_ano_motif
(
    date_traitement date,
    ref_ext character varying(50) COLLATE pg_catalog."default",
    ref_pivot character varying(50) COLLATE pg_catalog."default",
    cf_compte character varying(5) COLLATE pg_catalog."default",
    cyc_vie character varying(1) COLLATE pg_catalog."default",
    dte_cyc_vie character varying(10) COLLATE pg_catalog."default",
    dat_ouv_ctr character varying(10) COLLATE pg_catalog."default",
    nat_maj character varying(1) COLLATE pg_catalog."default",
    cre_pac_web character varying(1) COLLATE pg_catalog."default",
    typ_prd character varying(3) COLLATE pg_catalog."default",
    num_compte character varying(50) COLLATE pg_catalog."default",
    anc_num_compte character varying(50) COLLATE pg_catalog."default",
    typ_maj_icb character varying(1) COLLATE pg_catalog."default",
    code_prd character varying(25) COLLATE pg_catalog."default",
    anc_code_prd character varying(25) COLLATE pg_catalog."default",
    typ_maj_code_prd character varying(1) COLLATE pg_catalog."default",
    sty character varying(3) COLLATE pg_catalog."default",
    date_generation date,
    motif_rejet character varying(500) COLLATE pg_catalog."default",
    type_ano character varying(20) COLLATE pg_catalog."default"
);


CREATE TABLE public.icx_delta_ano_motif_his
(
    date_traitement date,
    ref_ext character varying(50) COLLATE pg_catalog."default",
    ref_pivot character varying(50) COLLATE pg_catalog."default",
    cf_compte character varying(5) COLLATE pg_catalog."default",
    cyc_vie character varying(1) COLLATE pg_catalog."default",
    dte_cyc_vie character varying(10) COLLATE pg_catalog."default",
    dat_ouv_ctr character varying(10) COLLATE pg_catalog."default",
    nat_maj character varying(1) COLLATE pg_catalog."default",
    cre_pac_web character varying(1) COLLATE pg_catalog."default",
    typ_prd character varying(3) COLLATE pg_catalog."default",
    num_compte character varying(50) COLLATE pg_catalog."default",
    anc_num_compte character varying(50) COLLATE pg_catalog."default",
    typ_maj_icb character varying(1) COLLATE pg_catalog."default",
    code_prd character varying(25) COLLATE pg_catalog."default",
    anc_code_prd character varying(25) COLLATE pg_catalog."default",
    typ_maj_code_prd character varying(1) COLLATE pg_catalog."default",
    sty character varying(3) COLLATE pg_catalog."default",
    date_generation date,
    motif_rejet character varying(500) COLLATE pg_catalog."default",
    type_ano character varying(20) COLLATE pg_catalog."default"
);

