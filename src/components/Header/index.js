import { useTheme } from "@emotion/react";
import { Box, Typography } from "@mui/material";
import { tokens } from "~/theme";

function Header({title, subtitle}) {
    const theme = useTheme();
    const colors = tokens(theme.palette.mode);


    return (  
        <div className="wrapper">
            <Box mb="20px">
                <Typography variant="h3" fontWeight="bold" color={colors.grey[100]} sx={{m: '0 0 5px 0'}}>
                    {title}
                </Typography>
                <Typography variant="h5" color={colors.greenAccent[700]}>{subtitle}</Typography>

            </Box>        
        </div>
    );
}

export default Header;